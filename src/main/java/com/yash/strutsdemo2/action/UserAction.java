package com.yash.strutsdemo2.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;
import com.yash.strutsdemo2.dao.UserDAO;
import com.yash.strutsdemo2.form.UserForm;
import com.yash.strutsdemo2.model.User;

public class UserAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) {

        UserForm userForm = (UserForm) form;
        UserDAO userDAO = new UserDAO();
        String action = request.getParameter("action");

        if (action == null || action.equals("list")) {
            request.setAttribute("users", userDAO.getAllUsers());
            return mapping.findForward("list");
        }

        if (action.equals("create")) {
            User user = new User();
            user.setName(userForm.getName());
            user.setEmail(userForm.getEmail());
            user.setPhone(userForm.getPhone());
            userDAO.addUser(user);
            return mapping.findForward("success");
        }

        if (action.equals("update")) {
            User user = new User();
            user.setId(userForm.getId());
            user.setName(userForm.getName());
            user.setEmail(userForm.getEmail());
            user.setPhone(userForm.getPhone());
            userDAO.updateUser(user);
            return mapping.findForward("success");
        }

        if (action.equals("delete")) {
            userDAO.deleteUser(userForm.getId());
            return mapping.findForward("success");
        }

        return mapping.findForward("error");
    }
}
