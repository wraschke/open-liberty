/*******************************************************************************
 * Copyright (c) 1997, 2006 IBM Corporation and others.
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

package com.ibm.ws.session.store.memory;

public class TooManySessionsException extends RuntimeException {

    private static final long serialVersionUID = -4651127178332480217L;

    public TooManySessionsException() {
        super();
    }

    public TooManySessionsException(String s) {
        super(s);
    }
}
