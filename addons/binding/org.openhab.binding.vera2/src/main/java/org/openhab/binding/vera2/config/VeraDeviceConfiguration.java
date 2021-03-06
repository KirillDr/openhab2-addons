/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.vera2.config;

import static org.openhab.binding.vera2.VeraBindingConstants.DEVICE_CONFIG_DEVICE_ID;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The {@link VeraDeviceConfiguration} class defines the model for a device configuration.
 *
 * @author Dmitriy Ponomarev
 */
public class VeraDeviceConfiguration {
    private String deviceId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append(DEVICE_CONFIG_DEVICE_ID, this.getDeviceId()).toString();
    }
}
