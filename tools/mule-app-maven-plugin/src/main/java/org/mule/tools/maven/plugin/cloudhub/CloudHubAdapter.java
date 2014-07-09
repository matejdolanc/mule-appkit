/**
 * Mule AppKit
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.tools.maven.plugin.cloudhub;

import java.io.File;
import java.util.Map;

/**
 * Interface to allow mocking of the CloudHub client (lots of final methods).
 */
public interface CloudHubAdapter {

    void create(String cloudHubUrl, String username, String password, String domain,String environment);

    void deploy(File file, String muleVersion, int workers, long maxWaitTime, Map<String,String> properties);

    void undeploy(long maxWaitTime);
}
