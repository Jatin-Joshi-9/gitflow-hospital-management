# GitFlow Branching Strategy – Hospital Management System

This repository demonstrates the **GitFlow branching strategy** using a simple **Hospital Management System** project.  
The primary focus of this project is to showcase **branching workflow, release management, and hotfix handling**, not complex business logic.

---

## What is GitFlow?

GitFlow is a Git branching model that provides a **structured approach** for managing:
- feature development
- integration
- releases
- production hotfixes

It is widely used in **enterprise and large-team environments** where releases are planned and controlled.

---

## Branches Used in This Project

### `main`
- Represents **production-ready code**
- Always stable
- Tagged with release versions (e.g. `v1.0.0`, `v1.0.1`)

### `develop`
- Integration branch for all completed features
- Source branch for release creation

### `feat/*` for features
- Used for new feature development
- Created from `develop`
- Merged back into `develop`

### `release/*`
- Used to prepare a new production release
- Created from `develop`
- Used for versioning, final testing, and minor fixes
- Merged into both `main` and `develop`

### `hotfix/*`
- Used to fix **urgent production issues**
- Created directly from `main`
- Merged into both `main` and `develop`

---

## GitFlow Workflow Implemented (Step-by-Step)

### Step 1: Initial Setup (`main`)
- Repository created
- Basic Hospital Management System setup added
- Initial commit pushed to `main`

Purpose:  
`main` always reflects production-ready code.

---

### Step 2: Create `develop` Branch
- `develop` branch created from `main`

Purpose:  
Acts as the integration branch where all features are combined.

---

### Step 3: Feature Development (`feat/add-patient`)
- Feature branch created from `develop`
- Patient registration logic added
- Feature merged back into `develop`

Purpose:  
Allows isolated development without impacting other work.

---

### Step 4: Release Preparation (`release/1.0.0`)
- Release branch created from `develop`
- Version updated and final checks performed

Purpose:  
Stabilizes code before production release.

---

### Step 5: Production Release
- Release branch merged into `main`
- Tagged as `v1.0.0`
- Release branch merged back into `develop`

Purpose:  
Ensures production code is released and development stays in sync.

---

### Step 6: Production Hotfix (`hotfix/add-exit-message`)
- Hotfix branch created from `main`
- Added a graceful exit message:
