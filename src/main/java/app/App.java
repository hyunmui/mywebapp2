package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import app.config.SampleEntityConfig;
import io.jooby.Jooby;
import io.jooby.di.SpringModule;
import io.jooby.freemarker.FreemarkerModule;
import io.jooby.hibernate.HibernateModule;
import io.jooby.hikari.HikariModule;

public class App extends Jooby {

  {
    // AnnotationConfigApplicationContext applicationContext = new
    // AnnotationConfigApplicationContext(
    // SampleEntityConfig.class);
    // install(new SpringModule(applicationContext));
    install(new SpringModule());
    install(new FreemarkerModule());
    install(new HikariModule());
    install(new HibernateModule());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
