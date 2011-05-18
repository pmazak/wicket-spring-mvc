package com.github.mazak.views;

import org.apache.wicket.Page;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalWindow;
import org.apache.wicket.markup.html.WebPage;

public class Modal extends WebPage
{
    public Modal()
    {
    	add(new Linkerama("linkerama"));
       final ModalWindow modal1;
        add(modal1 = new ModalWindow("modal1"));

        modal1.setCookieName("modal-1");
        modal1.setPageCreator(new ModalWindow.PageCreator()
        {
            public Page createPage()
            {
                return new ModalPage1(Modal.this, modal1);
            }
        });
        
    add(new AjaxLink("showModal1")
        {
            public void onClick(AjaxRequestTarget target)
            {
                modal1.show(target);
            }
        });
      
    final ModalWindow modal2;
        add(modal2 = new ModalWindow("modal2"));

        modal2.setCookieName("modal-2");
        modal2.setPageCreator(new ModalWindow.PageCreator()
        {
            public Page createPage()
            {
                return new ModalPage2(Modal.this,modal2);
            }
        });
        
    add(new AjaxLink("showModal2")
        {
            public void onClick(AjaxRequestTarget target)
            {
                modal2.show(target);
            }
        });
    }       
}