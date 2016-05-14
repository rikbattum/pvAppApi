/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageHandler;

import com.cloudinary.Cloudinary;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Gebruiker
 */
public class ImageHandler {

    private static Cloudinary cloudinary;

    public static Cloudinary getInstance() {

        if (cloudinary == null) {
            Map<String, String> config = new HashMap<>();
            config.put("cloud_name", "epona");
            config.put("api_key", "811828215936492");
            config.put("api_secret", "qIKECuPQVg3ZtMP2mgW9PtsFbHs");
            cloudinary = new Cloudinary(config);
        }

        return cloudinary;
    }
};
