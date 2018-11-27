labelR = new JLabel("赤");
            labelR.setBounds(40, 10, 20, 25);
            sliderR = new JSlider(0, 255, 0);
            sliderR.setBounds(60, 10, 200, 25);
            sliderR.setLabelTable(sliderR.createStandardLabels(50));
            sliderR.setPaintLabels(true);

            labelG = new JLabel("緑");
            labelG.setBounds(40, 50, 20, 25);
            sliderG = new JSlider(0, 255, 0);
            sliderG.setBounds(60, 50, 200, 25);
            sliderG.setLabelTable(sliderR.createStandardLabels(50));
            sliderG.setPaintLabels(true);

            labelB = new JLabel("青");
            labelB.setBounds(40, 90, 20, 25);
            sliderB = new JSlider(0, 255, 0);
            sliderB.setBounds(60, 90, 200, 25);
            sliderB.setLabelTable(sliderR.createStandardLabels(50));
            sliderB.setPaintLabels(true);

            labelPen = new JLabel("ペンの大きさ");
            labelPen.setBounds(280, 10, 100, 25);
            sliderPen = new JSlider(2, 50, 25);
            sliderPen.setBounds(360, 10, 200, 25);
            sliderPen.setLabelTable(sliderR.createStandardLabels(10));
            sliderPen.setPaintLabels(true);