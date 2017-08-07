package cn.datai.gift.web.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import java.io.IOException;

public class JMEPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    public void setLocations(Resource... locations) {
        super.setLocations(locations);

        if (locations == null || locations.length <= 0) {
            return;
        }
        for (Resource resource : locations) {
            try {
                Resources.addResources(resource.getFile());
            }
            catch (IOException ex) {
                logger.warn("添加到Resources失败: " + resource.getFilename());
            }
        }

    }
}
