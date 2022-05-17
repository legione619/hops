/*
 * This file is part of Hopsworks
 * Copyright (C) 2021, Logical Clocks AB. All rights reserved
 *
 * Hopsworks is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Hopsworks is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */
package io.hops.hopsworks.persistence.entity.alertmanager;

import javax.xml.bind.annotation.XmlEnum;
import java.util.HashMap;
import java.util.Map;

@XmlEnum
public enum AlertType {
  DEFAULT("DEFAULT", "default", "default"),
  SYSTEM_ALERT("SYSTEM_ALERT", "system-alert", ""),
  GLOBAL_ALERT_EMAIL("GLOBAL_ALERT_EMAIL", "global-alert-email", "global-receiver__email"),
  GLOBAL_ALERT_SLACK("GLOBAL_ALERT_SLACK", "global-alert-slack", "global-receiver__slack"),
  GLOBAL_ALERT_PAGERDUTY("GLOBAL_ALERT_PAGERDUTY", "global-alert-pagerduty", "global-receiver__pagerduty"),
  GLOBAL_ALERT_PUSHOVER("GLOBAL_ALERT_PUSHOVER", "global-alert-pushover", "global-receiver__pushover"),
  GLOBAL_ALERT_OPSGENIE("GLOBAL_ALERT_OPSGENIE", "global-alert-opsgenie", "global-receiver__opsgenie"),
  GLOBAL_ALERT_WEBHOOK("GLOBAL_ALERT_WEBHOOK", "global-alert-webhook", "global-receiver__webhook"),
  GLOBAL_ALERT_VICTOROPS("GLOBAL_ALERT_VICTOROPS", "global-alert-victorops", "global-receiver__victorops"),
  GLOBAL_ALERT_WEBCHAT("GLOBAL_ALERT_WEBCHAT", "global-alert-wechat", "global-receiver__wechat"),
  PROJECT_ALERT("PROJECT_ALERT", "project-alert", "");

  private final String name;
  private final String value;
  private final String receiverName;

  private static final Map<String, AlertType> lookup = new HashMap<>();
  private static final Map<String, AlertType> lookupReceiver = new HashMap<>();

  static {
    for (AlertType a : AlertType.values()) {
      lookup.put(a.value, a);
      if (!a.receiverName.equals("")) {
        lookupReceiver.put(a.receiverName, a);
      }
    }
  }

  AlertType(String name, String value, String receiverName) {
    this.name = name;
    this.value = value;
    this.receiverName = receiverName;
  }

  public static AlertType fromString(String name) {
    return valueOf(name.toUpperCase());
  }

  public static AlertType fromValue(String value) {
    return lookup.get(value);
  }

  public static AlertType fromReceiverName(String receiverName) {
    return lookupReceiver.get(receiverName);
  }

  public String getName() {
    return name;
  }

  public String getValue() {
    return value;
  }

  public String getReceiverName() {
    return receiverName;
  }
  
  public boolean isGlobal() {
    return !this.equals(AlertType.DEFAULT) && !this.equals(AlertType.SYSTEM_ALERT) &&
        !this.equals(AlertType.PROJECT_ALERT);
  }

}
