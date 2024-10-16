/*******************************************************************************
 * Copyright (c) 2012, 2014 IBM Corporation and others.
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
package com.ibm.ws.classloading.internal;

import java.util.EnumSet;

import com.ibm.wsspi.classloading.ApiType;

/**
 * An interface for anything that has access to a restricted set of APIs.
 */
public interface DeclaredApiAccess {

    EnumSet<ApiType> getApiTypeVisibility();

}
