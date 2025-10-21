package com.armandodev.util;

import com.armandodev.internal.messages.AlertMessageInternal;
import com.armandodev.internal.messages.ErrorMessageInternal;
import com.armandodev.internal.messages.QuestionMessageInternal;
import com.armandodev.internal.messages.SucessMessageInternal;

public class MessagesUtil {

    public static void alert(java.awt.Frame parent, boolean modal, String titulo, String subTitulo, String Mensagem) {
        AlertMessageInternal internal = new AlertMessageInternal(parent,modal,titulo,subTitulo,Mensagem);
        internal.setVisible(true);  
        internal = null;
    }
    
    public static void error(java.awt.Frame parent, boolean modal, String titulo, String subTitulo, String Mensagem) {
        ErrorMessageInternal internal = new ErrorMessageInternal(parent, modal, titulo, subTitulo, Mensagem);
        internal.setVisible(true);  
        internal = null;
    }
    
    public static void sucess(java.awt.Frame parent, boolean modal, String titulo, String Mensagem) {
        SucessMessageInternal internal = new SucessMessageInternal(parent, modal, titulo, Mensagem);
        internal.setVisible(true);  
        internal = null;
    }
    
    public static boolean question(java.awt.Frame parent, boolean modal, String titulo, String Mensagem) {
        QuestionMessageInternal internal = new QuestionMessageInternal(parent, modal, titulo, Mensagem);
        internal.setVisible(true);  
        return internal.isConfirma();        
    }
  
}
