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
package io.hops.hopsworks.api.alert.receiver;

import io.hops.hopsworks.alerting.config.dto.EmailConfig;
import io.hops.hopsworks.alerting.config.dto.OpsgenieConfig;
import io.hops.hopsworks.alerting.config.dto.PagerdutyConfig;
import io.hops.hopsworks.alerting.config.dto.PushoverConfig;
import io.hops.hopsworks.alerting.config.dto.SlackConfig;
import io.hops.hopsworks.alerting.config.dto.VictoropsConfig;
import io.hops.hopsworks.alerting.config.dto.WebhookConfig;
import io.hops.hopsworks.alerting.config.dto.WechatConfig;
import io.hops.hopsworks.common.api.RestDTO;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class ReceiverDTO extends RestDTO<ReceiverDTO> {

  private String name;
  private List<EmailConfig> emailConfigs;
  private List<PagerdutyConfig> pagerdutyConfigs;
  private List<PushoverConfig> pushoverConfigs;
  private List<SlackConfig> slackConfigs;
  private List<OpsgenieConfig> opsgenieConfigs;
  private List<WebhookConfig> webhookConfigs;
  private List<VictoropsConfig> victoropsConfigs;
  private List<WechatConfig> wechatConfigs;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<EmailConfig> getEmailConfigs() {
    return emailConfigs;
  }

  public void setEmailConfigs(List<EmailConfig> emailConfigs) {
    this.emailConfigs = emailConfigs;
  }

  public List<PagerdutyConfig> getPagerdutyConfigs() {
    return pagerdutyConfigs;
  }

  public void setPagerdutyConfigs(List<PagerdutyConfig> pagerdutyConfigs) {
    this.pagerdutyConfigs = pagerdutyConfigs;
  }

  public List<PushoverConfig> getPushoverConfigs() {
    return pushoverConfigs;
  }

  public void setPushoverConfigs(List<PushoverConfig> pushoverConfigs) {
    this.pushoverConfigs = pushoverConfigs;
  }

  public List<SlackConfig> getSlackConfigs() {
    return slackConfigs;
  }

  public void setSlackConfigs(List<SlackConfig> slackConfigs) {
    this.slackConfigs = slackConfigs;
  }

  public List<OpsgenieConfig> getOpsgenieConfigs() {
    return opsgenieConfigs;
  }

  public void setOpsgenieConfigs(List<OpsgenieConfig> opsgenieConfigs) {
    this.opsgenieConfigs = opsgenieConfigs;
  }

  public List<WebhookConfig> getWebhookConfigs() {
    return webhookConfigs;
  }

  public void setWebhookConfigs(List<WebhookConfig> webhookConfigs) {
    this.webhookConfigs = webhookConfigs;
  }

  public List<VictoropsConfig> getVictoropsConfigs() {
    return victoropsConfigs;
  }

  public void setVictoropsConfigs(List<VictoropsConfig> victoropsConfigs) {
    this.victoropsConfigs = victoropsConfigs;
  }

  public List<WechatConfig> getWechatConfigs() {
    return wechatConfigs;
  }

  public void setWechatConfigs(List<WechatConfig> wechatConfigs) {
    this.wechatConfigs = wechatConfigs;
  }
}
