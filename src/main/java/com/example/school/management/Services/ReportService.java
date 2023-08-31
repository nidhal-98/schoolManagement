package com.example.school.management.Services;

import com.example.school.management.Models.Student;
import com.example.school.management.Repositories.StudentRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {

    String pathToReports = "C:\\Users\\user012\\Desktop\\Spring boot";

    @Autowired
    StudentRepository studentRepository;

    public String generateReport() throws FileNotFoundException, JRException {
        List<Student> studentList = studentRepository.findAll();

        File file = new File("C:\\Users\\user012\\Desktop\\Task 6\\schoolManagement\\src\\main\\resources\\School_Report.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(studentList);
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("CreatedBy", "Nidhal");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, paramters, dataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, pathToReports + "\\schools.pdf");
        return "Report generated : " + pathToReports + "\\schools.pdf";
    }
}
