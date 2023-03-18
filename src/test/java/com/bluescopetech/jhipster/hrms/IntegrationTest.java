package com.bluescopetech.jhipster.hrms;

import com.bluescopetech.jhipster.hrms.JhipsterhrmsApp;
import com.bluescopetech.jhipster.hrms.config.AsyncSyncConfiguration;
import com.bluescopetech.jhipster.hrms.config.EmbeddedElasticsearch;
import com.bluescopetech.jhipster.hrms.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JhipsterhrmsApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
