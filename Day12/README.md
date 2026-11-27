# Day 12 – Window, Alert and Frame Handling in Selenium

## Topics Covered

### Window Handling
- Handling multiple browser windows and tabs.
- Retrieving parent and child window handles.
- Using `getWindowHandle()` and `getWindowHandles()`.
- Switching between windows using `switchTo().window()`.
- Closing the child window and returning to the parent window.

### Alert Handling
- Handling simple JavaScript alerts.
- Handling confirmation alerts.
- Handling prompt alerts.
- Retrieving alert messages using `getText()`.
- Accepting and dismissing alerts.
- Entering text into prompt alerts using `sendKeys()`.

### Frame Handling
- Handling nested frames.
- Switching between parent and child frames.
- Retrieving text from frames.
- Using `parentFrame()` and `defaultContent()`.

## Programs

| File | Description |
|---|---|
| WindowHandlingDemo.java | Handles parent and child browser windows. |
| AlertHandlingDemo.java | Handles simple, confirmation and prompt alerts. |
| FrameHandlingDemo.java | Handles nested frames and retrieves frame content. |

## Practice Websites

- [Multiple Windows](https://the-internet.herokuapp.com/windows)
- [JavaScript Alerts](https://the-internet.herokuapp.com/javascript_alerts)
- [Nested Frames](https://the-internet.herokuapp.com/nested_frames)

## Technologies Used

- Java
- Selenium WebDriver
- ChromeDriver
- WebDriverManager

## Learning Outcomes

- Managing multiple browser windows and tabs.
- Interacting with different types of JavaScript alerts.
- Navigating between nested frames.
- Switching WebDriver control between different browsing contexts.