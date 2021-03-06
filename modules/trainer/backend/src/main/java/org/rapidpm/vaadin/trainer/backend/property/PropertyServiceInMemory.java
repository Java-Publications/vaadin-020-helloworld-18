package org.rapidpm.vaadin.trainer.backend.property;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.rapidpm.vaadin.trainer.api.property.PropertyService;

/**
 *
 */
public class PropertyServiceInMemory implements PropertyService {
  private final Map<String, String> storage = new HashMap<>();

  @Override
  public String resolve(final String key) {
    return storage.get(key);
  }

  @Override
  public boolean hasKey(final String key) {
    return storage.containsKey(key);
  }

  @PostConstruct
  public void init() {


    storage.put("admin", "admin");

    storage.put("generic.ok", "Ok");
    storage.put("generic.cancel", "Cancel");

    storage.put("login.name", "Login"); // i18n
    storage.put("login.info", "Please enter your username and password"); // i18n
    storage.put("login.username", "username"); // i18n
    storage.put("login.password", "password"); // i18n
    storage.put("login.failed", "Login failed..."); // i18n
    storage.put("login.failed.description", "Login failed, please use right User / Password combination"); // i18n

    storage.put("login.language.de", "German");
    storage.put("login.language.en", "English");

    storage.put("app.logo", "/images/rapidpm.PNG"); // i18n
    storage.put("app.version", "Jumpstart Version 0.x.y"); // i18n


    storage.put("menue.default.help", "Help"); // i18n
    storage.put("menue.default.help.contact", "Contact"); // i18n
    storage.put("menue.default.help.support", "Support"); // i18n
    storage.put("menue.default.help.impressum", "Impressum"); // i18n
    storage.put("menue.default.help.disclaimer", "Disclaimer"); // i18n

    storage.put("menue.default.main", "Home"); // i18n
    storage.put("menue.default.main.logout", "Logout"); // i18n7

    storage.put("menue.default.chat", "Chat"); // i18n
  }
}
