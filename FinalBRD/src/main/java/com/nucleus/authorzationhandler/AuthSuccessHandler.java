package com.nucleus.authorzationhandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class AuthSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler 
{
    protected String determineTargetUrl(HttpServletRequest request, HttpServletResponse response)
    {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String role = auth.getAuthorities().toString();

        String targetUrl = "";
        if(role.contains("ROLE_USER")) {
            targetUrl = "/welcomeuser";
        } else if(role.contains("ROLE_ADMIN"))
        {
            targetUrl = "/welcomeadmin";
        }
        return targetUrl;
    }

}
