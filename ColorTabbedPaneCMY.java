package swingprogram;

public class ColorTabbedPaneCMY {

	public static void main(String[] args) {
        JFrame frame = new JFrame("CMY Tabs");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        tabbedPane.addTab("CYAN", cyanPanel);
        tabbedPane.addTab("MAGENTA", magentaPanel);
        tabbedPane.addTab("YELLOW", yellowPanel);

        // ✅ Change Listener (no lambda → no error)
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();
                System.out.println("Selected Tab: " + tabbedPane.getTitleAt(index));
            }
        });

        frame.add(tabbedPane);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}