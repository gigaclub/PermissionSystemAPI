package net.gigaclub.permissionsystemapi;

import net.gigaclub.base.odoo.Odoo;
import org.apache.xmlrpc.XmlRpcException;
import org.json.JSONArray;

import java.util.*;

public class PermissionSystem {

    private Odoo odoo;

    public PermissionSystem(String hostname, String database, String username, String password) {
        this.odoo = new Odoo(hostname, database, username, password);
    }

    public JSONArray getAllGroups() {
        try {
            return new JSONArray(
                this.odoo.getModels().execute(
                    "execute_kw",
                    Arrays.asList(
                        this.odoo.getDatabase(),
                        this.odoo.getUid(),
                        this.odoo.getPassword(),
                        "gc.permission.group",
                        "get_all_groups",
                        Arrays.asList()
                    )
                )
            );
        } catch (XmlRpcException e) {
            e.printStackTrace();
        }
        return null;
    }

}