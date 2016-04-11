package br.com.ative.controller;

import org.jboss.spring.quickstarts.greeter.greeter_spring.domain.EntityDAO;
import org.jboss.spring.quickstarts.greeter.greeter_spring.domain.UserDao;
import org.zkoss.chart.Chart;
import org.zkoss.chart.Charts;
import org.zkoss.chart.Point;
import org.zkoss.chart.Series;
import org.zkoss.chart.plotOptions.PieDataLabels;
import org.zkoss.chart.plotOptions.PiePlotOptions;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.Window;

//@Component
//@Scope(value="desktop")
@VariableResolver(DelegatingVariableResolver.class)
public class DashboardController extends SelectorComposer<Component> {
	private static final long serialVersionUID = -19069936302572548L;
	
	@Wire
    private Charts chart;
	
	@WireVariable
	private EntityDAO entityDAO;
	
	 @WireVariable
	    private UserDao userDao;
    
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        
//        List<Empresa> empresas = dao.findAll(Empresa.class);
        
        Series series = chart.getSeries();
        series.setType("pie");
//        series.setName(empresas.get(0).getRazao());
        series.setName("Teste");
        series.addPoint(new Point("Firefox", 45.0));
        series.addPoint(new Point("IE", 26.8));
        Point chrome = new Point("Chrome", 12.8);
        chrome.setSelected(true);
        chrome.setSliced(true);
        series.addPoint(chrome);
        series.addPoint(new Point("Safari", 8.5));
        series.addPoint(new Point("Opera", 6.2));
        series.addPoint(new Point("Others", 0.7));
        
        Chart chartOptional = chart.getChart();
        chartOptional.setPlotBorderWidth(0);
        chartOptional.setPlotShadow(false);
        
        chart.getTooltip().setPointFormat(
            "{series.name}: <b>{point.percentage:.1f}%</b>");
        
        PiePlotOptions plotOptions = chart.getPlotOptions().getPie();
        
        plotOptions.setAllowPointSelect(true);
        plotOptions.setCursor("pointer");
        PieDataLabels dataLabels = (PieDataLabels)plotOptions.getDataLabels();
        dataLabels.setEnabled(true);
        dataLabels.setFormat("<b>{point.name}</b>: {point.percentage:.1f} %");
    }
}
