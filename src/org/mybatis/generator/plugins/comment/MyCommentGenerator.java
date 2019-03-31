package org.mybatis.generator.plugins.comment;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.Properties;

public class MyCommentGenerator implements CommentGenerator {

	@Override
	public void addConfigurationProperties(Properties properties) {
		// TODO Auto-generated method stub
		
		
		//com.suning.go
		//govbus.invoice.confirm.  
		
	}

	@Override
	public void addFieldComment(Field field,
			IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		// TODO Auto-generated method stub
	    if (introspectedColumn.getRemarks() != null && !introspectedColumn.getRemarks().equals("")) {
	        field.addJavaDocLine("/**");
	        field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
	       // addJavadocTag(field, false);
	        field.addJavaDocLine(" */");
	    }
	}

	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
		// TODO Auto-generated method stub

		
	}

	@Override
	public void addClassComment(InnerClass innerClass,
			IntrospectedTable introspectedTable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addClassComment(InnerClass innerClass,
			IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEnumComment(InnerEnum innerEnum,
			IntrospectedTable introspectedTable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGetterComment(Method method,
			IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSetterComment(Method method,
			IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGeneralMethodComment(Method method,
			IntrospectedTable introspectedTable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addJavaFileComment(CompilationUnit compilationUnit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addComment(XmlElement xmlElement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addRootComment(XmlElement rootElement) {
		// TODO Auto-generated method stub
		
	}

}
