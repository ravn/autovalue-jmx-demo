package dk.kb.tra.autovaluejmx;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {
        var l = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            Animal animal = Animal.create("" + i, i);
            if (i == 1) {
                final ObjectName objectName = new ObjectName("dk.kb.arkitekturgruppen:type=HelloWorld");
                ManagementFactory.getPlatformMBeanServer().registerMBean(animal, objectName);
            }
            l.add(animal);
        }
        System.out.println(l);
        Thread.sleep(1000000);
    }

}
