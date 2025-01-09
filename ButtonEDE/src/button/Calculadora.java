package button;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField textField;
	private double num1, num2, result;
	private String operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 11, 260, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		// Botones numéricos
		int x = 10, y = 72;
		for (int i = 1; i <= 9; i++) {
			JButton btn = new JButton(String.valueOf(i));
			btn.setBounds(x, y, 50, 50);
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String currentText = textField.getText();
					textField.setText(currentText + btn.getText());
				}
			});
			frame.getContentPane().add(btn);
			x += 60;
			if (i % 3 == 0) {
				x = 10;
				y += 60;
			}
		}

		// Botón de 0
		JButton btn0 = new JButton("0");
		btn0.setBounds(70, y, 50, 50);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = textField.getText();
				textField.setText(currentText + "0");
			}
		});
		frame.getContentPane().add(btn0);

		// Botón de suma
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(nepackage button;
		import java.awt.EventQueue;

		public class Calculadora {

			private JFrame frame;
			private JTextField textField;
			private double num1, num2, result;
			private String operator;

			/**
			 * Launch the application.
			 */
			public static void main(String[] args) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Calculadora window = new Calculadora();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}

			/**
			 * Create the application.
			 */
			public Calculadora() {
				initialize();
			}

			/**
			 * Initialize the contents of the frame.
			 */
			private void initialize() {
				frame = new JFrame();
				frame.setBounds(100, 100, 300, 400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().setLayout(null);

				textField = new JTextField();
				textField.setBounds(10, 11, 260, 50);
				frame.getContentPane().add(textField);
				textField.setColumns(10);

				// Botones numéricos
				int x = 10, y = 72;
				for (int i = 1; i <= 9; i++) {
					JButton btn = new JButton(String.valueOf(i));
					btn.setBounds(x, y, 50, 50);
					btn.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String currentText = textField.getText();
							textField.setText(currentText + btn.getText());
						}
					});
					frame.getContentPane().add(btn);
					x += 60;
					if (i % 3 == 0) {
						x = 10;
						y += 60;
					}
				}

				// Botón de 0
				JButton btn0 = new JButton("0");
				btn0.setBounds(70, y, 50, 50);
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String currentText = textField.getText();
						textField.setText(currentText + "0");
					}
				});
				frame.getContentPane().add(btn0);

				// Botón de suma
				JButton btnAdd = new JButton("+");
				btnAdd.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						num1 = Double.parseDouble(textField.getText());
						operator = "+";
						textField.setText("");
					}
				});
				btnAdd.setBounds(190, 72, 50, 50);
				frame.getContentPane().add(btnAdd);

				// Botón de resta
				JButton btnSubtract = new JButton("-");
				btnSubtract.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						num1 = Double.parseDouble(textField.getText());
						operator = "-";
						textField.setText("");
					}
				});
				btnSubtract.setBounds(190, 132, 50, 50);
				frame.getContentPane().add(btnSubtract);

				// Botón de multiplicación
				JButton btnMultiply = new JButton("*");
				btnMultiply.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						num1 = Double.parseDouble(textField.getText());
						operator = "*";
						textField.setText("");
					}
				});
				btnMultiply.setBounds(190, 192, 50, 50);
				frame.getContentPane().add(btnMultiply);

				// Botón de división
				JButton btnDivide = new JButton("/");
				btnDivide.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						num1 = Double.parseDouble(textField.getText());
						operator = "/";
						textField.setText("");
					}
				});
				btnDivide.setBounds(190, 252, 50, 50);
				frame.getContentPane().add(btnDivide);

				// Botón de igual
				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						num2 = Double.parseDouble(textField.getText());
						switch (operator) {
						case "+":
							result = num1 + num2;
							break;
						case "-":
							result = num1 - num2;
							break;
						case "*":
							result = num1 * num2;
							break;
						case "/":
							if (num2 != 0) {
								result = num1 / num2;
							} else {
								textField.setText("Error");
								return;
							}
							break;
						}
						textField.setText(String.valueOf(result));
					}
				});
				btnEqual.setBounds(130, 252, 50, 50);
				frame.getContentPane().add(btnEqual);

				// Botón de reset
				JButton btnReset = new JButton("C");
				btnReset.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textField.setText("");
						num1 = 0;
						num2 = 0;
						operator = "";
					}
				});
				btnReset.setBounds(10, 252, 50, 50);
				frame.getContentPane().add(btnReset);
			}
		}

	}w ActionListener() {
		public void actionPerformed(ActionEvent e) {
			num1 = Double.parseDouble(textField.getText());
			operator = "+";
			textField.setText("");
		}
	});
		btnAdd.setBounds(190, 72, 50, 50);
		frame.getContentPane().add(btnAdd);

		// Botón de resta
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				operator = "-";
				textField.setText("");
			}
		});
		btnSubtract.setBounds(190, 132, 50, 50);
		frame.getContentPane().add(btnSubtract);

		// Botón de multiplicación
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformpackage button;
			import java.awt.EventQueue;

			public class Calculadora {

				private JFrame frame;
				private JTextField textField;
				private double num1, num2, result;
				private String operator;

				/**
				 * Launch the application.
				 */
				public static void main(String[] args) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								Calculadora window = new Calculadora();
								window.frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}

				/**
				 * Create the application.
				 */
				public Calculadora() {
					initialize();
				}

				/**
				 * Initialize the contents of the frame.
				 */
				private void initialize() {
					frame = new JFrame();
					frame.setBounds(100, 100, 300, 400);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.getContentPane().setLayout(null);

					textField = new JTextField();
					textField.setBounds(10, 11, 260, 50);
					frame.getContentPane().add(textField);
					textField.setColumns(10);

					// Botones numéricos
					int x = 10, y = 72;
					for (int i = 1; i <= 9; i++) {
						JButton btn = new JButton(String.valueOf(i));
						btn.setBounds(x, y, 50, 50);
						btn.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								String currentText = textField.getText();
								textField.setText(currentText + btn.getText());
							}
						});
						frame.getContentPane().add(btn);
						x += 60;
						if (i % 3 == 0) {
							x = 10;
							y += 60;
						}
					}

					// Botón de 0
					JButton btn0 = new JButton("0");
					btn0.setBounds(70, y, 50, 50);
					btn0.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							String currentText = textField.getText();
							textField.setText(currentText + "0");
						}
					});
					frame.getContentPane().add(btn0);

					// Botón de suma
					JButton btnAdd = new JButton("+");
					btnAdd.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							num1 = Double.parseDouble(textField.getText());
							operator = "+";
							textField.setText("");
						}
					});
					btnAdd.setBounds(190, 72, 50, 50);
					frame.getContentPane().add(btnAdd);

					// Botón de resta
					JButton btnSubtract = new JButton("-");
					btnSubtract.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							num1 = Double.parseDouble(textField.getText());
							operator = "-";
							textField.setText("");
						}
					});
					btnSubtract.setBounds(190, 132, 50, 50);
					frame.getContentPane().add(btnSubtract);

					// Botón de multiplicación
					JButton btnMultiply = new JButton("*");
					btnMultiply.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							num1 = Double.parseDouble(textField.getText());
							operator = "*";
							textField.setText("");
						}
					});
					btnMultiply.setBounds(190, 192, 50, 50);
					frame.getContentPane().add(btnMultiply);

					// Botón de división
					JButton btnDivide = new JButton("/");
					btnDivide.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							num1 = Double.parseDouble(textField.getText());
							operator = "/";
							textField.setText("");
						}
					});
					btnDivide.setBounds(190, 252, 50, 50);
					frame.getContentPane().add(btnDivide);

					// Botón de igual
					JButton btnEqual = new JButton("=");
					btnEqual.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							num2 = Double.parseDouble(textField.getText());
							switch (operator) {
							case "+":
								result = num1 + num2;
								break;
							case "-":
								result = num1 - num2;
								break;
							case "*":
								result = num1 * num2;
								break;
							case "/":
								if (num2 != 0) {
									result = num1 / num2;
								} else {
									textField.setText("Error");
									return;
								}
								break;
							}
							textField.setText(String.valueOf(result));
						}
					});
					btnEqual.setBounds(130, 252, 50, 50);
					frame.getContentPane().add(btnEqual);

					// Botón de reset
					JButton btnReset = new JButton("C");
					btnReset.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							textField.setText("");
							num1 = 0;
							num2 = 0;
							operator = "";
						}
					});
					btnReset.setBounds(10, 252, 50, 50);
					frame.getContentPane().add(btnReset);
				}
			}

		}ed(ActionEvent e) {
			num1 = Double.parseDouble(textField.getText());
			operator = "*";
			textField.setText("");
		}
});
		btnMultiply.setBounds(190, 192, 50, 50);
		frame.getContentPane().add(btnMultiply);

		// Botón de división
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				operator = "/";
				textField.setText("");
			}
		});
		btnDivide.setBounds(190, 252, 50, 50);
		frame.getContentPane().add(btnDivide);

		// Botón de igual
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(textField.getText());
				switch (operator) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 - num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					if (num2 != 0) {
						result = num1 / num2;
					} else {
						textField.setText("Error");
						return;
					}
					break;
				}
				textField.setText(String.valueOf(result));
			}
		});
		btnEqual.setBounds(130, 252, 50, 50);
		frame.getContentPane().add(btnEqual);

		// Botón de reset
		JButton btnReset = new JButton("C");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				num1 = 0;
				num2 = 0;
				operator = "";
			}
		});
		btnReset.setBounds(10, 252, 50, 50);
		frame.getContentPane().add(btnReset);
	}
}

