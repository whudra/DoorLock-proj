<%@page import="DAO.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    	out.print("hello");
    	UserDAO dao = new UserDAO();
    	out.print(dao.He());
    %>