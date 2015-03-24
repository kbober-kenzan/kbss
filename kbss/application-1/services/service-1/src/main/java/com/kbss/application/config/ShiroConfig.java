package com.kbss.application.config;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.text.PropertiesRealm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.AnonymousFilter;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.filter.authc.UserFilter;
import org.apache.shiro.web.filter.authz.RolesAuthorizationFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

public class ShiroConfig {
	
//	@Bean(name = "shiroFilter")
//	public ShiroFilterFactoryBean shiroFilter() {
//	    
//		ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
//	    shiroFilter.setLoginUrl("/login");
//	    shiroFilter.setSuccessUrl("/index");
//	    shiroFilter.setUnauthorizedUrl("/forbidden");
//	    
//	    Map<String, String> filterChainDefinitionMapping = new HashMap<String, String>();
//	    filterChainDefinitionMapping.put("/", "anon");
//	    filterChainDefinitionMapping.put("/home", "authc,roles[guest]");
//	    filterChainDefinitionMapping.put("/admin", "authc,roles[admin]");
//	    shiroFilter.setFilterChainDefinitionMap(filterChainDefinitionMapping);
//	    shiroFilter.setSecurityManager(securityManager());
//	    
//	    Map<String, Filter> filters = new HashMap<String, Filter>();
//	    filters.put("anon", new AnonymousFilter());
//	    filters.put("authc", new FormAuthenticationFilter());
//	    filters.put("logout", new LogoutFilter());
//	    filters.put("roles", new RolesAuthorizationFilter());
//	    filters.put("user", new UserFilter());
//	    shiroFilter.setFilters(filters);
//	    
//	    System.out.println(shiroFilter.getFilters().size());
//	    return shiroFilter;
//	}
//
//	@Bean(name = "securityManager")
//	public SecurityManager securityManager() {
//	    DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//	    securityManager.setRealm(realm());
//	    return securityManager;
//	}
//
//	@Bean(name = "realm")
//	@DependsOn("lifecycleBeanPostProcessor")
//	public PropertiesRealm realm() {
//	    PropertiesRealm propertiesRealm = new PropertiesRealm();
//	    propertiesRealm.init();
//	    return propertiesRealm;
//	}
//
//	@Bean
//	public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
//	    return new LifecycleBeanPostProcessor();
//	}
}
