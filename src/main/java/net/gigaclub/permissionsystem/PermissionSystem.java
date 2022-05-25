package net.gigaclub.permissionsystem;

import net.gigaclub.base.odoo.Odoo;
import org.apache.xmlrpc.XmlRpcException;

import java.util.*;

public class PermissionSystem {

    private Odoo odoo;

    public PermissionSystem(String hostname, String database, String username, String password) {
        this.odoo = new Odoo(hostname, database, username, password);
    }

}