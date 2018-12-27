package com.lko.shopingBackend.Configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.lko.shopingBackend")
@EnableTransactionManagement
public class oracleConfiguration {
	
	private final static String Database_Driver= "oracle.jdbc.OracleDriver";
	private final static String Database_URL= "jdbc:oracle:thin:@localhost:1521:XE";
	private final static String Database_UserName= "EveryNeed.in";
	private final static String Database_Password= "9415016516";
	private final static String Database_Dialect= "org.hibernate.dialect.Oracle10gDialect";
	
	@Bean(name="dataSource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(Database_Driver);
		dataSource.setUrl(Database_URL);
		dataSource.setUsername(Database_UserName);
		dataSource.setPassword(Database_Password);
		System.out.println("------------------------DataSource Object Created---------------------");
		return dataSource;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBuilder lsfb = new LocalSessionFactoryBuilder(dataSource);
		lsfb.addProperties(getHibernateProperties());
		lsfb.scanPackages("com.lko.shopingBackend");
		System.out.println("------------------------SessionFactory Object Created---------------------");
		return lsfb.buildSessionFactory();
		
	}
	
	private Properties getHibernateProperties()
	{
		Properties hibernateprop = new Properties();
		hibernateprop.put("hibernate.dialect",Database_Dialect);
		hibernateprop.put("hibernate.hbm2ddl.auto", "update");
		hibernateprop.put("hibernate.show_sql", "true");
		hibernateprop.put("hibernate.format_sql", "true");
		System.out.println("------------------------Hibernate Object Created---------------------");
		return hibernateprop;
		
	}
	
	@Bean
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("------------------------Hibernate Transaction Object Created---------------------");
		return new HibernateTransactionManager(sessionFactory);
	}
	
	

}
