/*******************************************************************************
 * Copyright (c) 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.ws390.smf.formatters;

import java.io.UnsupportedEncodingException;

import com.ibm.ws390.sm.smfview.SmfPrintStream;
import com.ibm.ws390.sm.smfview.SmfRecord;
import com.ibm.ws390.sm.smfview.UnsupportedVersionException;
import com.ibm.ws390.sm.smfview.WebContainerActivitySmfRecord;

/**
 * Formats the SMF 120 Subtype 7 record
 *
 */

public class SMFType120SubType7 extends WebContainerActivitySmfRecord {
    /**
     * Constructor
     * 
     * @param smfRecord The SMF record to be contained by this object
     * @throws UnsupportedVersionException  bad version
     * @throws UnsupportedEncodingException bad encoding
     */
    public SMFType120SubType7(SmfRecord smfRecord) throws UnsupportedVersionException, UnsupportedEncodingException {
        super(smfRecord);

    }

    @Override
    public void dump(SmfPrintStream aPrintStream) {
        super.dump(aPrintStream);
    }
}
