package com.br.alcateiadev.microservicelogin.microservicelogin.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component
public class LoginFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return auth != null;
    }

    @Override
    public Object run() {
        HttpSession session = RequestContext.getCurrentContext().getRequest().getSession();
        if (session != null) {
            RequestContext.getCurrentContext().addZuulRequestHeader("Cookie", "X-Auth-Token=" + session.getId());
        }
        return null;
    }
}
