/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day03;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLToObject {

    public static void main(String[] args) {
        try {
            File file = new File("employee.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Employee e = (Employee) jaxbUnmarshaller.unmarshal(file);
            System.out.println(e.getId() + " " + e.getName() + " " + e.getSalary());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
