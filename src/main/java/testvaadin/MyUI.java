package testvaadin;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.*;

@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        VerticalLayout layout = new VerticalLayout();

        layout.addComponent(new Label("Hello, how are you ? ", ContentMode.HTML));

        Button btn = new Button("Push me");
        btn.setDescription(
                "<h2><img src=\"../VAADIN/themes/sampler/"+
                        "icons/comment_yellow.gif\"/>"+
                        "A richtext tooltip</h2>"+
                        "<ul>"+
                        " <li>Use rich formatting with HTML</li>"+
                        " <li>Include images from themes</li>"+
                        " <li>etc.</li>"+
                        "</ul>");

        layout.addComponent(btn);

        Grid<Person> grid = new Grid<>();
        grid.setCaption("MyGrid");
        grid.setSizeFull();
        grid.setItems(GridGenerate.getPersons());
        grid.addColumn(Person::getFirstname).setCaption("Name");
        grid.addColumn(Person::getLastname).setCaption("LastName");

        layout.addComponent(grid);
//
//        final TextField name = new TextField();
//        name.setCaption("Type your name here:");
//
//        Button button = new Button("Click Me");
//        button.addClickListener(e -> {
//            layout.addComponent(new Label("Thanks " + name.getValue()
//                    + ", it works!"));
//        });
//
//        layout.addComponents(name, button);

        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
