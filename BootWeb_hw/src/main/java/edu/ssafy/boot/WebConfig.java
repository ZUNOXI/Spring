package edu.ssafy.boot;

import javax.activation.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//@Configuration
//@ComponentScan({"edu.ssafy"})
//@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{
	
//	public DataSource getDataSource() {
//		BasicDataSource ds = new BasicDataSource();
//		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		ds.setUrl("jdbc:mysql://localhost:3306/springweb?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8");
//		ds.setUsername("root");
//		ds.setPassword("root");
//		ds.setMaxActivie(20);
//		return ds;
//	}
//	
//	SqlSessionFactoryBean getSqlSessionFactoryBean() {
//		SqlSessionFactoryBean sbean = new SqlSessionFactoryBean();
//		String configLoc = "classpath:/spring/MybatisConfig.xml";
//		sbean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource(configLoc));
//		return sbean;
//	}
	
//	@Bean
//	public ViewResolver getViewResolver() {
//		InternalResorceViewResolver resolver = new InternalResourceViewResolver(prefix, suffix);
//		resolver.set~~?
//	}
//	
//	
}
