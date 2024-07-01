package com.jorge.curso.springboot.backend.backend_products;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.jorge.curso.springboot.backend.backend_products.entities.Product;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
       // esta class de configuracion es para exponer el id cuando se hagan peticiones rest desde el frontend
        config.exposeIdsFor(Product.class);
    }
    

}
