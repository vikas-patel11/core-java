package com.core_java;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;



public class SalesChart {

    public static void main(String[] args) {

        // Dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();



        dataset.addValue(18000, "Purchase Amount", "2026-01-10");
        dataset.addValue(26500, "Purchase Amount", "2026-01-15");
        dataset.addValue(26500, "Purchase Amount", "2026-02-10");
        dataset.addValue(26500, "Purchase Amount", "2026-01-20");

        // Create Bar Chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Day-wise Purchase Report",
                "Date",
                "Amount (₹)",
                dataset
        );

        // Display Chart
        ChartFrame frame = new ChartFrame("Inventory Graph", chart);
        frame.setSize(800, 500);
        frame.setVisible(true);
    }
}
