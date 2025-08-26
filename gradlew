
#!/usr/bin/env sh
if command -v gradle >/dev/null 2>&1; then
  exec gradle "$@"
else
  echo "Please install Gradle first" >&2
  exit 1
fi
