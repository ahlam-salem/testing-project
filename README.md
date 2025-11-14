README – Manual Testing for Repin System SFA
Overview

This document outlines the manual testing process for the Repin System SFA. It covers key modules and provides guidance on test preparation, execution, and documentation. The goal is to ensure all functionalities work as expected and meet business requirements.

Modules & Test Scope
1. Add Orders

Description:
Allows users to create new orders from the dashboard.

Manual Testing Focus:

Verify that orders can be added successfully.

Check mandatory fields validation.

Confirm correct data is saved and displayed in order lists.

Test error handling for invalid input.

Preconditions:

User is logged in and has appropriate permissions.

Products exist in the system for ordering.

Test Data:

Sample products, quantities, and customer information.

2. Purchase Order

Description:
Handles creation and management of purchase orders.

Manual Testing Focus:

Create, edit, and delete purchase orders.

Verify the correct calculation of totals, taxes, and discounts.

Confirm status updates reflect correctly (e.g., pending, approved).

Preconditions:

Suppliers are preconfigured in the system.

Test Data:

Supplier details, product quantities, unit prices.

3. Gifts in Return Orders

Description:
Manages gifts associated with returned orders.

Manual Testing Focus:

Validate gift addition to return orders.

Verify return order status updates.

Ensure correct stock adjustments.

Preconditions:

Return orders are created in the system.

Test Data:

Orders eligible for return, gift items, quantities.

4. Add Instructions

Description:
Allows users to add operational or process instructions.

Manual Testing Focus:

Verify creation and saving of instructions.

Check character limits and formatting.

Validate display in the instructions list.

Preconditions:

User has permission to add instructions.

Test Data:

Sample instruction text.

5. Add New Content

Description:
Used to add documentation or system content.

Manual Testing Focus:

Verify content is saved, displayed, and editable.

Check file attachments or embedded media (if applicable).

Preconditions:

User has permissions to add content.

Test Data:

Sample documentation content (text, images, files).

6. List Instructions

Description:
Displays all existing instructions.

Manual Testing Focus:

Ensure all instructions are listed correctly.

Test search, filter, and pagination (if applicable).

Preconditions:

Instructions must exist in the system.

Test Data:

Various instructions with different priorities or types.

7. List Documentation Content

Description:
Lists all documentation content added in the system.

Manual Testing Focus:

Validate listing accuracy.

Check filters, search, and categories.

Test access permissions.

Preconditions:

Documentation content exists.

Test Data:

Various content types (text, files, images).

8. List Documentation Categories

Description:
Shows all categories of documentation.

Manual Testing Focus:

Verify all categories are listed.

Test adding, editing, and deleting categories.

Preconditions:

Categories must exist in the system.

Test Data:

Sample categories (e.g., training, policy, SOP).

General Guidelines for Manual Testing

Preparation: Ensure test data is ready and preconditions are met.

Execution: Perform steps as per test cases, recording actual vs expected results.

Reporting: Log defects with detailed steps and screenshots.

Validation: Re-test fixed defects and verify system stability.