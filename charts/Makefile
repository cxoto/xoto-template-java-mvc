# 定义默认版本号
VERSION ?= 1.0.0

# 目标：替换 Chart.yaml 中的 #version 占位符
replace-version:
	@echo "Replacing #version with $(VERSION) in helm-prod/Chart.yaml..."
	@sed -i 's/#version/$(VERSION)/g' helm-prod/Chart.yaml
	@echo "Done! Chart.yaml updated with version $(VERSION)."

# 目标：恢复 Chart.yaml 中的 #version 占位符
restore-version:
	@echo "Restoring #version in helm-prod/Chart.yaml..."
	@sed -i 's/$(VERSION)/#version/g' helm-prod/Chart.yaml
	@echo "Done! Chart.yaml restored with #version placeholder."

# 目标：清理生成的文件
clean:
	@echo "Cleaning up..."
	@rm -f helm-prod/Chart.yaml.bak
	@echo "Done! Cleaned up backup files."