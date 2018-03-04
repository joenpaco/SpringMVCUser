package com.joenpaco.configs;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableJpaRepositories(basePackages = {ResourceNames.DAOS})
@Configuration
@PropertySource(ResourceNames.PROPERTIES)
@ComponentScan(basePackages= {ResourceNames.BASEPACKAGES})
@EnableTransactionManagement
public class PersistenceConfig {

    @Autowired
    private Environment environment;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("dataSource.driver"));
        dataSource.setUrl(environment.getProperty("dataSource.url"));
        dataSource.setUsername(environment.getProperty("dataSource.username"));
        dataSource.setPassword(environment.getProperty("dataSource.password"));
        LogManager.getLogger(this.getClass()).info("Datasource: " + dataSource.getUrl());
        return dataSource;
    }

//    @Bean
//    public EntityManagerFactory entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
//        Properties properties = new Properties();
//        properties.put("hibernate.connection.charSet", "UTF-8");
//        properties.put("hibernate.show_sql", "false");
//        properties.put("hibernate.format_sql", "true");
//        // create-drop, create, update, validate
//        properties.put("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
//        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
//        entityManagerFactoryBean.setJpaProperties(properties);
//        entityManagerFactoryBean.setPackagesToScan(ResourceNames.MODELS, ResourceNames.MODELS);
//        entityManagerFactoryBean.setDataSource(dataSource());
//        entityManagerFactoryBean.afterPropertiesSet();
//        return entityManagerFactoryBean.getObject();
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory());
//        return transactionManager;
//    }
    
    @Bean
    public JdbcTemplate jdbcTemplate() {
    	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
    	return jdbcTemplate;
    }

}
