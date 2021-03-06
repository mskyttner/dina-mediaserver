package se.nrm.mediaserver.util;

import java.util.Properties;

/**
 *
 * @author ingimar
 */
public class MediaURL {

    public String getPathToStream() {
        String path = this.getPathByKey("relative_stream_url");
        return path;
    }

    private String getPathByKey(String key) {
        String path = "";
        Properties prop = AdminProperties.getAdminConfigProperties();
        String base_url = prop.getProperty("base_url");
        String relative_url = prop.getProperty(key);
        path = path.concat(base_url).concat(relative_url);

        return path;
    }
}
