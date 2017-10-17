/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author 715583
 */
public class DebugTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
       
        String url = pageContext.getRequest().getServerName();
        String query =pageContext.getRequest().getParameter("debug");
   
        System.out.println("query:"+query);
        JspWriter out = pageContext.getOut();
        int index = url.indexOf(".");
        if(index == -1) index=url.length();
        if(query==null) query = "123";
        if(query.equals("")) query="debug";
        System.out.println("rul:"+url);
 
//        int indexQ = url.indexOf(3);
    
//    //    System.out.println("index debug:"+indexQ);
//        
        if(!query.equals("debug")) return SKIP_BODY;
        else
        {
            String Notdomain = url.substring(0,index);

            if(Notdomain.equals("test") || Notdomain.equals("localhost"))
            {
                return EVAL_BODY_INCLUDE;
            }
            return SKIP_BODY;
        }
      //  System.out.println("ip:"+Notdomain);
        
        
        
    }

}
