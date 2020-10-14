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

package com.ibm.ws390.sm.smfview;

import java.io.UnsupportedEncodingException;

public class LibertyBatchAccountingSection extends SmfEntity {

    /** Supported version of this class. */
    public final static int s_supportedVersion = 1;

    /** version of section. */
    public int m_version;

    /** length of data */
    public int m_length;

    /** accounting string */
    public String m_accountingString;

    //----------------------------------------------------------------------------
    /**
     * Returns the supported version of this class.
     * 
     * @return supported version of this class.
     */
    @Override
    public int supportedVersion() {

        return s_supportedVersion;

    } // supportedVersion()	

    public LibertyBatchAccountingSection(SmfStream aSmfStream) throws UnsupportedVersionException, UnsupportedEncodingException {

        super(s_supportedVersion);
        m_version = aSmfStream.getInteger(4);

        m_length = aSmfStream.getInteger(4);
        m_accountingString = aSmfStream.getString(128, SmfUtil.EBCDIC);

    }

    //----------------------------------------------------------------------------
    /**
     * Dumps the fields of this object to a print stream.
     * 
     * @param aPrintStream   The stream to print to.
     * @param aTripletNumber The triplet number of this LibertyRequestInfoSection.
     */
    public void dump(SmfPrintStream aPrintStream, int aTripletNumber) {

        aPrintStream.println("");
        aPrintStream.printKeyValue("Triplet #", aTripletNumber);
        aPrintStream.printlnKeyValue("Type", "LibertyBatchAccountingSection");

        aPrintStream.push();
        aPrintStream.printlnKeyValue("Accounting Info Version             ", m_version);

        aPrintStream.printlnKeyValue("Accounting String Length            ", m_length);
        aPrintStream.printlnKeyValue("Accounting String                   ", m_accountingString);

        aPrintStream.pop();
    }

}
