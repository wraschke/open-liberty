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
package com.ibm.ws.test.wsfeatures.client;

import java.io.IOException;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.jws.HandlerChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;
import javax.xml.ws.soap.Addressing;

import com.ibm.ws.test.client.stub.ImageServiceImplServiceTwo;
import com.ibm.ws.test.client.stub.ImageServiceTwo;

public class WSAEnabledWSDLServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Addressing(required = true)
    @WebServiceRef(value = ImageServiceImplServiceTwo.class)
    @HandlerChain(file = "handler/handler-test-client.xml")
    ImageServiceImplServiceTwo imageService;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ImageServiceTwo proxy = imageService.getImageServiceImplPortTwo();
        int port = request.getLocalPort();
        String host = request.getLocalAddr();

        BindingProvider provider = (BindingProvider) proxy;
        provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                                         "http://" + host + ":" + port + "/webServiceRefFeatures/ImageServiceImplServiceTwo");

        proxy.uploadImage("ServiceInjection", new DataHandler(new FileDataSource("resources/" + "a.jpg")));

    }
}
