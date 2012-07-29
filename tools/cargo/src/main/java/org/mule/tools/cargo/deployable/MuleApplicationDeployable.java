package org.mule.tools.cargo.deployable;

import org.codehaus.cargo.container.deployable.DeployableType;

/**
 * A mule application deployable. Matches http://www.mulesoft.org/documentation/display/MMP/Home packaging type.
 */
public class MuleApplicationDeployable extends AbstractMuleDeployable  {

    public static final DeployableType TYPE = DeployableType.toType("zip");

    public MuleApplicationDeployable(final String file) {
        super(file);
    }

    @Override
    public DeployableType getType() {
        return MuleApplicationDeployable.TYPE;
    }

}