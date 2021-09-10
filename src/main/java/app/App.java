package app;

import io.jooby.Jooby;
import io.jooby.di.SpringModule;
import io.jooby.freemarker.FreemarkerModule;
import io.jooby.hikari.HikariModule;

public class App extends Jooby {

  {
    install(new SpringModule());
    install(new FreemarkerModule());
    install(new HikariModule());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
