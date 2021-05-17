<%@page import="DAO.UserDAO"%>
<%@page import="DTO.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	String serial = request.getParameter("Serial");
	String pw = request.getParameter("Password");
	
	UserDTO dto = new UserDTO();
	UserDTO dto2 = new UserDTO();
	
	if(serial != null){
		dto.setSerialNumber(serial);
		dto2 = UserDAO.getInstance().getUserinfoSerial(dto);
	}
	else {
		dto.setA_pw(pw);
		dto2 = UserDAO.getInstance().getUserinfoPW(dto);
	}
	
	out.print(dto2.getIp() + "/" + dto2.getPort());
%>