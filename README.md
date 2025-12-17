# 📘 Scanner.hasNext Explanation

This repository provides **explanations and sample code** to demonstrate how the `Scanner.hasNext()` method works in Java.  
It is intended as a learning resource for beginners who want to understand how to check for available input tokens using the `Scanner` class.

---

## 📌 About `Scanner.hasNext()`

In Java, the `Scanner.hasNext()` method returns `true` if there **is another token available** in the input to read. It does *not* consume the token — it only checks whether there is more data available. :contentReference[oaicite:0]{index=0}

### Key Points

- `hasNext()` returns `true` if the scanner has another token in its input. :contentReference[oaicite:1]{index=1}  
- It returns `false` when there is **no more input available** or the input stream is exhausted. :contentReference[oaicite:2]{index=2}  
- Calling `hasNext()` **does not advance** the scanner position. :contentReference[oaicite:3]{index=3}  
- If the `Scanner` object is closed, calling this method throws `IllegalStateException`. :contentReference[oaicite:4]{index=4}

Note: Tokens are typically separated by whitespace by default. So words or numbers separated by spaces or newlines are considered separate tokens. :contentReference[oaicite:5]{index=5}

---

## 📂 Project Structure

Scanner.hasNext-explanation/
├── examples/ # Example Java programs using Scanner.hasNext()
├── notes/ # Explanation and comments
├── screenshots/ # Optional output examples
├── README.md # This file
└── LICENSE # (If applicable)

##🔍 How It Works

When reading from keyboard input, hasNext() may block and wait for the user to provide input before returning. 

When reading from a file or stream, it returns false once the end of stream is reached. 

Combining hasNext() with next() inside a loop is a common pattern for reading all available tokens safely without causing exceptions.

## 🧠 Tips

🔹 Use patterns such as hasNextInt(), hasNextDouble() if you want to check specific types. 

🔹 Be careful when mixing hasNext() with other next methods (nextLine(), etc.) as input boundaries can behave differently.

## 🤝 Contributing

Contributions are welcome! If you want to add more examples or deeper explanations:

Fork this repository

Create a feature branch (git checkout -b my-feature)

Commit your changes (git commit -m "Add new example")

Push (git push origin my-feature)

Open a Pull Request
