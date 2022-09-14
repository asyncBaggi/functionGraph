import org.jfree.chart.ChartFactory
import org.jfree.chart.ChartPanel
import org.jfree.chart.plot.PlotOrientation
import org.jfree.data.xy.XYDataset
import org.jfree.data.xy.XYSeries
import org.jfree.data.xy.XYSeriesCollection
import javax.swing.JFrame


fun main() {
    val series = XYSeries("")
    for (i in 0..15) {
        val point = if (i % 2 == 0) i / 3 else i * 6
        series.add(i.toDouble(), point)
    }
    val xyDataset: XYDataset = XYSeriesCollection(series)
    val chart = ChartFactory.createXYLineChart(
        "", "x", "y",
        xyDataset,
        PlotOrientation.VERTICAL,
        false, false, false
    )
    val frame = JFrame("")
    frame.contentPane.add(ChartPanel(chart))
    frame.setSize(800, 600)
    frame.show()
}