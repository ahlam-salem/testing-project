# testing-project
This repository contains **test cases** for core user stories in an e-commerce application.  
Each story includes acceptance criteria, positive and negative scenarios, and decision table coverage.

---

## 📌 User Story 1: Open a Credit Card Account
**Description:**  
As a customer, I want to open a credit card account so that I can get discounts on my purchases.

**Acceptance Criteria:**
1. New customers receive a **15% discount** on purchases made on the same day of account creation.  
2. Existing customers with a **loyalty card** get a **10% discount**.  
3. Customers with a **coupon** get **20% off**, but coupons **cannot be combined** with the new customer discount.  
4. Discount amounts are added where applicable (loyalty + coupon).  

**Notes:**  
- Negative cases include expired coupon, invalid loyalty card, and new customer purchasing after first day.  

---

## 📌 User Story 2: Add Product to Cart
**Description:**  
As a customer, I want to add a product to my cart so that I can buy this product.

**Acceptance Criteria:**
1. Product must have at least **one item in stock** to be added.  
2. If the product is **out of stock**, the user cannot add it to the cart.  
3. User must click on **Add to Cart button** to perform the action.  
4. A **confirmation message** is displayed once product is added.  
5. Notification message contains a **link to the cart page**.  
6. The user must be **logged in** to add items to the cart.  

**Notes:**  
- Negative cases: guest user tries to add, out-of-stock product, broken link in notification.  

---

## 📌 User Story 3: Contact Us
**Description:**  
As a customer, I want to contact the website about a problem with my product.

**Acceptance Criteria:**
1. Email must be **valid** in the format `name@domain.xyz`.  
2. **Email** is mandatory.  
3. **Contact name** is mandatory.  
4. **Message** is mandatory and must not exceed **500 characters**.  

**Notes:**  
- Negative cases: invalid email format, empty mandatory fields, message length > 500 chars.  

---

## 📂 Repository Contents
- `test-cases.csv` → Decision table and test cases for all stories.  
- `README.md` → This documentation.  

---

## 🚀 How to Use
1. Open `test-cases.csv` to review the detailed test cases.  
2. Use acceptance criteria above as reference for test coverage.  
3. Extend test data and scenarios based on edge cases (e.g., expired coupon, invalid email).  