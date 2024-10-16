/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.jaxws.metadata;

import java.util.List;

import com.ibm.ws.javaee.dd.common.SecurityRole;
import com.ibm.ws.javaee.dd.web.common.LoginConfig;
import com.ibm.ws.javaee.dd.web.common.SecurityConstraint;

/**
 * a transient ServiceSecurityInfo
 */
public class ServiceSecurityInfo {

    private List<SecurityConstraint> securityConstraints;

    private List<SecurityRole> securityRoles;

    private LoginConfig loginConfig;

    public ServiceSecurityInfo(List<SecurityConstraint> securityConstraints, List<SecurityRole> securityRoles, LoginConfig loginConfig) {
        this.securityConstraints = securityConstraints;
        this.securityRoles = securityRoles;
        this.loginConfig = loginConfig;
    }

    /**
     * @return the securityConstraints
     */
    public List<SecurityConstraint> getSecurityConstraints() {
        return securityConstraints;
    }

    /**
     * @param securityConstraints the securityConstraints to set
     */
    public void setSecurityConstraints(List<SecurityConstraint> securityConstraints) {
        this.securityConstraints = securityConstraints;
    }

    /**
     * @return the securityRoles
     */
    public List<SecurityRole> getSecurityRoles() {
        return securityRoles;
    }

    /**
     * @param securityRoles the securityRoles to set
     */
    public void setSecurityRoles(List<SecurityRole> securityRoles) {
        this.securityRoles = securityRoles;
    }

    /**
     * @return the loginConfig
     */
    public LoginConfig getLoginConfig() {
        return loginConfig;
    }

    /**
     * @param loginConfig the loginConfig to set
     */
    public void setLoginConfig(LoginConfig loginConfig) {
        this.loginConfig = loginConfig;
    }
}
