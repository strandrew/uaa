/*******************************************************************************
 *     Cloud Foundry 
 *     Copyright (c) [2009-2014] Pivotal Software, Inc. All Rights Reserved.
 *
 *     This product is licensed to you under the Apache License, Version 2.0 (the "License").
 *     You may not use this product except in compliance with the License.
 *
 *     This product includes a number of subcomponents with
 *     separate copyright notices and license terms. Your use of these
 *     subcomponents is subject to the terms and conditions of the
 *     subcomponent's license, as noted in the LICENSE file.
 *******************************************************************************/

package org.cloudfoundry.identity.uaa.oauth;

import org.springframework.security.oauth2.provider.ClientDetails;

public interface ClientDetailsValidator {
    
    /**
     * 
     * @param clientDetails
     * @param create true if this is a creation request, false if this is a modification request
     * @return A validated and possibly modified client
     */
    ClientDetails validate(ClientDetails clientDetails, boolean create) throws InvalidClientDetailsException;

}