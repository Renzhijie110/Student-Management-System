package com.zhijie.sm.config;

import com.zhijie.sm.DAO.StudentDAO;
import com.zhijie.sm.DAO.StudentDAOImpl;
import com.zhijie.sm.api.Student;
import com.zhijie.sm.service.StudentService;
import com.zhijie.sm.service.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.zhijie.sm.controller"})
public class StudentAppConfig implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        return jdbcTemplate;
    }
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("19990528");
        dataSource.setUrl("jdbc:mysql://localhost:3306/zhijie?useSSL=false");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }
    @Bean
    public StudentDAO studentDAO(){
        StudentDAO studentDAO = new StudentDAOImpl();
        return studentDAO;
    }
    @Bean
    public StudentService studentService(){
        StudentService studentService =new StudentServiceImpl();
        return studentService;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/URLToReachResourcesFolder/**")
                .addResourceLocations("/resources/");
        registry
                .addResourceHandler("/URLToReachImagesFolder/**")
                .addResourceLocations("/resources/images/");
    }
}
