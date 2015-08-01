
import java.awt.Dimension;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class charts extends okno {

    /**
     * TODO
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     * @param appTitle
     * @param chartTitle
     */
    public charts(String appTitle, String chartTitle) {
        super();

        JFreeChart lineChart = ChartFactory.createLineChart(
                appTitle,
                "Powtorzenie",
                "Czas[ns]",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new Dimension(560, 367));
        setContentPane(chartPanel);

    }

    /**
     *
     * @return
     */
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i <= 500; i++) {
            dataset.addValue(okno.tab_czasow[i], "czas", "Nr: " + i);
        }
        return dataset;
    }

    public static void wywolaj() {

        charts MongoCharts = new charts("Czasy zapytań", "Wykres");
        MongoCharts.pack();
        RefineryUtilities.centerFrameOnScreen(MongoCharts);
        MongoCharts.setVisible(true);
    }
}
